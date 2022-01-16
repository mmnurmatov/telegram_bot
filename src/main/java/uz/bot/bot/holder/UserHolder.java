package uz.gita.bot.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.User;
import uz.gita.bot.controller.MainController;
import uz.gita.bot.dto.UserDto;
import uz.gita.bot.repository.UserRepository;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserHolder {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserHolder.class);

    public static Map<Integer, UserDto> userHolderMap = new TreeMap<Integer, UserDto>();

    public static void fillUserMapHolder() {
        LOGGER.info("\n -- USER MAP HOLDER --");

        UserRepository repository = new UserRepository();
        List<UserDto> userDtoList = repository.get_all();

        for (UserDto dto : userDtoList) {
            userHolderMap.put(dto.getUser_t_id(), dto);
        }

        LOGGER.info("USER MAP SIZE " + userDtoList.size());
    }

    // true if_new_user_created false if_user_exists
    public static void checkAddUser(MainController mainController, User user, String text) {
        UserRepository userRepository = new UserRepository();

        if (!userHolderMap.containsKey(user.getId())) {
            UserDto userDto = new UserDto();

            userDto.setUser_t_id(user.getId());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDto.setUserName(user.getUserName());

            Long uId = userRepository.create(userDto);
            userDto.setId(uId);
            userHolderMap.put(user.getId(), userDto);

            LOGGER.info(" \n ---  ADDED NEW USER " + userDto.toString());
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId("54398465");
            sendMessage.setText("<b>New User Joined</b>\n" + user.toString());
            sendMessage.setParseMode("HTML");

            mainController.sendMsg(sendMessage);
        } else {
            LOGGER.info("CREATE NEW USER REQUEST");
            UserDto userDto = userHolderMap.get(user.getId());
            userRepository.create_user_request(userDto.getId(), userDto.getUser_t_id(), text);
        }
        LOGGER.info(" TOTAL USER COUNT:  " + userHolderMap.size());

    }

    public static void removeUser(Integer user_t_id) {
        UserRepository userRepository = new UserRepository();
        if (userHolderMap.containsKey(user_t_id)) {
            UserDto userDto = userHolderMap.remove(user_t_id);
            LOGGER.info(" REMOVING USER :  " + userDto.toString());
            userRepository.remove(userDto.getId(), user_t_id);
        }
    }
}

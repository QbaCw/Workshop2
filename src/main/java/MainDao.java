import java.util.Arrays;

public class MainDao  {
    public static void main(String[] args) {

      UserDao.CreatedDataBase ();

     /* UserDao userDao = new UserDao();
      User user1 = new User();
      user1.setUserName("Kubaa");
      user1.setEmail("kuba@wmail.com");
      user1.setPassword("kuba12");
      userDao.create(user1);*/

      /*User user2 = new User();
      user2.setUserName("Ania");
      user2.setEmail("ania@mail.com");
      user2.setPassword("hasło12");
      userDao.create(user2);*/

        /*User resoultRead1 = userDao.read(5);
        System.out.println(resoultRead1);

        User userUpdate = userDao.read(1);
        userUpdate.setUserName("Kuba2");
        userUpdate.setEmail("kuba2@email.com");
        userUpdate.setPassword("smfknanf");
        userDao.update(userUpdate);

        User resoultRead2 = userDao.read(1);
        System.out.println(resoultRead2); */

        UserDao userDao = new UserDao();
        userDao.delete(7);

        UserDao userDAO = new UserDao();

        User[] result = userDAO.findAll();
        System.out.println(Arrays.toString(result));

    }


}

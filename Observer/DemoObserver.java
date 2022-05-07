public class DemoObserver {
    public static void main(String[] args) {
        User[] list = new User[10];
        list[0] = new User();
        list[1] = new User();
        list[2] = new User();
        list[3] = new User();
        list[4] = new User();
        list[5] = new User();
        list[6] = new User();
        list[7] = new User();
        list[8] = new User();
        list[9] = new User();
        
        new People(list[0]);
        new People(list[1]);
        new People(list[2]);
        new People(list[3]);
        new People(list[4]);
        new People(list[5]);
        new People(list[6]);
        new People(list[7]);
        new People(list[8]);
        new People(list[9]);
        
        User.setDataBirthday(1, "13/12/1995");
        User.setDataBirthday(2, "11/12/1995");
        User.setPublish(1);
        User.setPublish(1);

        System.out.println(User.getDateBirthday(2));
        System.out.println(User.getSize());
    }
}

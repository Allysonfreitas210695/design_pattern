
public class People extends Observer{
    People(User user){
        this.user = user;
        User.addUser(this);
    }

    @Override
    public void update(String nome) {
        System.out.println(nome);
    }
}

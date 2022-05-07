import java.util.ArrayList;
import java.util.List;

public class User{
   private static List<Observer> observers = new ArrayList<Observer>();
   static int randomId = 0;
   public int idUser;
   private String dataBirthday;
   private int publish;

   public static void addUser(Observer observer){ 
      incrementId();
      observer.user.idUser = randomId;
      observer.user.dataBirthday = "00/00/00";
      observer.user.publish = 0;
      observers.add(observer);		
   }

   public static void incrementId(){
      randomId = randomId + 1;
   }

   public static int getSize(){
      return observers.size();
   }

   public static String getDateBirthday(int idUser){
      return observers.get(idUser-1).user != null ? observers.get(idUser-1).user.dataBirthday : null;
   }

   public static int getPublish(int idUser){
      return observers.get(idUser-1).user != null ? observers.get(idUser-1).user.publish : null;
   }

   public boolean isEmpty(){
      return observers.isEmpty();
   }
   
   public static void setDataBirthday(int idUser, String dataBirthday){
      if(dataBirthday != null && dataBirthday != ""){
         for (int i = 0; i < User.getSize(); i++) {
            if(observers.get(i).user.idUser == idUser){
               observers.get(i).user.dataBirthday = dataBirthday;
               notifyAllObservers(idUser, observers.get(i).user.dataBirthday, -1);
            }
         }
         System.out.println();
      }else {
         System.err.println("erro dataBirthday!!");
      }
   }

   public static void setPublish(int idUser){
      for (int i = 0; i < User.getSize(); i++) {
         if(observers.get(i).user.idUser == idUser){
            observers.get(i).user.publish++;
            notifyAllObservers(idUser, null, observers.get(i).user.publish);
         }
      }
      System.out.println();
   }

   public static void notifyAllObservers(int idUser, String dataBirthday, int publish){
      for (int i = 0; i < User.getSize(); i++) {
         if(dataBirthday == null){
            if(observers.get(i).user.idUser != idUser) {
               observers.get(i).update(
                                "User "+ observers.get(i).user.idUser + ", " + 
                                "User with id "+ idUser +" muded Published to "+ 
                                 observers.get(idUser - 1).user.publish);
            }
         }else if(dataBirthday != null){
            if(observers.get(i).user.idUser != idUser) {
               observers.get(i).update(
                                "User "+ observers.get(i).user.idUser + ", " + 
                                "User with id "+ idUser +" muded DataBirthday to "+ 
                                 observers.get(idUser - 1).user.dataBirthday);
            }
         }
      }
   }
}
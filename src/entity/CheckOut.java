package entity;

import entity.readingmaterial.ReadingMaterial;
import user.member.Member;

public class CheckOut {
   private ReadingMaterial article;
   private int checkout;
   private int checkIn;
   private String status;
   private Member person;


   public CheckOut(int checkout, int checkIn, String status, Member person){
      this.checkout = checkout;
      this.checkIn = checkIn;
      this.status = status;
      this.person = person;
   }

   public int getCheckout(){
      return this.checkout;
   }
   public int getCheckIn(){
      return this.checkIn;
   }
   public String getStatus(){
      return this.status;
   }


   public void setCheckout(){
      this.checkout = checkout;
   }

   public void setCheckIn(){
      this.checkIn = checkIn;
   }
   public void setStatus(){
      this.status = status;
   }

}

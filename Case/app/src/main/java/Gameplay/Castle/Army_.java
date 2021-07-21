package Gameplay.Castle;

public class Army_ {
    int Army_Attack;
    int Number_Troops_Army;
    String Type_Army;
    double Boost_Attack=0.2;



    public int getArmy_Attack() {

        return Army_Attack;
    }


    public void setArmy_Attack(int army_Attack) {

        Army_Attack = army_Attack;
    }


    public int getNumber_Troops_Army() {

        return Number_Troops_Army;
    }


    public void setNumber_Troops_Army(int number_Troops_Army) {
        Number_Troops_Army = number_Troops_Army;
    }


    public String getType_Army() {

        return Type_Army;
    }


    public void setType_Army(String type_Army) {

        Type_Army = type_Army;
    }


    public Army_() {
        this.Army_Attack = (int) ((Number_Troops_Army*Boost_Attack)+Number_Troops_Army);
    }
}

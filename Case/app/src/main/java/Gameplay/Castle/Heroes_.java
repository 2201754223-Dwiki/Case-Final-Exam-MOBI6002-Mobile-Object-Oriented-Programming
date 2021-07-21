package Gameplay.Castle;

public class Heroes_ {
    int Heroes_Skill_Infantry;
    int Heroes_Skill_Cavalry;
    int Heroes_Skill_Archer;
    int Heroes_Skill_Catapult;
    String Type_Hero;
    double Boost_Skill=0.2;
    int Skill_Hero;
    int Number_Heroes_Infantry;
    int Number_Heroes_Cavalry;
    int Number_Heroes_Catapult;
    int Number_Heroes_Archer;

    public Heroes_() {
        this.Heroes_Skill_Infantry = (int) ((Boost_Skill*Number_Heroes_Infantry)+Number_Heroes_Infantry);
        this.Heroes_Skill_Cavalry = (int) ((Boost_Skill*Number_Heroes_Cavalry)+Number_Heroes_Cavalry);
        this.Heroes_Skill_Catapult = (int) ((Boost_Skill*Number_Heroes_Catapult)+Number_Heroes_Catapult);
        this.Heroes_Skill_Archer = (int) ((Boost_Skill*Number_Heroes_Archer)+Number_Heroes_Archer);
    }

    public int getHeroes_Skill_Infantry() {

        return Heroes_Skill_Infantry;
    }

    public void setHeroes_Skill_Infantry(int heroes_Skill_Infantry) {
        Heroes_Skill_Infantry = heroes_Skill_Infantry;
    }

    public int getHeroes_Skill_Cavalry() {

        return Heroes_Skill_Cavalry;
    }

    public void setHeroes_Skill_Cavalry(int heroes_Skill_Cavalry) {
        Heroes_Skill_Cavalry = heroes_Skill_Cavalry;
    }

    public int getHeroes_Skill_Archer() {

        return Heroes_Skill_Archer;
    }

    public void setHeroes_Skill_Archer(int heroes_Skill_Archer) {
        Heroes_Skill_Archer = heroes_Skill_Archer;
    }

    public int getHeroes_Skill_Catapult() {

        return Heroes_Skill_Catapult;
    }

    public void setHeroes_Skill_Catapult(int heroes_Skill_Catapult) {
        Heroes_Skill_Catapult = heroes_Skill_Catapult;
    }

    public double getBoost_Skill() {

        return Boost_Skill;
    }

    public void setBoost_Skill(double boost_Skill) {

        Boost_Skill = boost_Skill;
    }

    public int getNumber_Heroes_Infantry() {

        return Number_Heroes_Infantry;
    }

    public void setNumber_Heroes_Infantry(int number_Heroes_Infantry) {
        Number_Heroes_Infantry = number_Heroes_Infantry;
    }

    public int getNumber_Heroes_Cavalry() {

        return Number_Heroes_Cavalry;
    }

    public void setNumber_Heroes_Cavalry(int number_Heroes_Cavalry) {
        Number_Heroes_Cavalry = number_Heroes_Cavalry;
    }

    public int getNumber_Heroes_Catapult() {

        return Number_Heroes_Catapult;
    }

    public void setNumber_Heroes_Catapult(int number_Heroes_Catapult) {
        Number_Heroes_Catapult = number_Heroes_Catapult;
    }

    public int getNumber_Heroes_Archer() {

        return Number_Heroes_Archer;
    }

    public void setNumber_Heroes_Archer(int number_Heroes_Archer) {
        Number_Heroes_Archer = number_Heroes_Archer;
    }

    public String getType_Hero() {

        return Type_Hero;
    }

    public void setType_Hero(String type_Hero) {

        Type_Hero = type_Hero;
    }

    public int getSkill_Hero() {

        return Skill_Hero;
    }

    public void setSkill_Hero(int skill_Hero) {

        Skill_Hero = skill_Hero;
    }

}

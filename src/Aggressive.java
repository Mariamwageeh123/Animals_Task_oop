public class Aggressive extends Animal  {
    private double power;

    @Override
    public void Sound(String Sound) {
        System.out.println("your sound is "+Sound);
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void AttackPower() {
        setPower(getHealth());
    }
    public void attacker(Peaceful Power) {
        Power.GotAttack(this.power);
//        ==Power.GotAttack(getPower());
    }
}

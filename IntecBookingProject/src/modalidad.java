public class modalidad {

    Boolean isStrict;

    public modalidad(){
        this.isStrict = true;
    }

    public void cambiarModalidad(){

        this.isStrict = !isStrict;

    }

    public boolean getModalidad(){
        return isStrict;
    }

}

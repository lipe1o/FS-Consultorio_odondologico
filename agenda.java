public class horario{
    public double horario;
    public String data;
    
    public void marcar_horario(double valor){
        this.horario=this.horario+valor;
    }
    public void marcar_data(String valor){
        this.data=this.data+valor;
    }
    public void desmarcar_horario(double valor){
        this.horario= valor;
    }
    public void desmarcar_data(String valor){
        this.data=valor;
    }
    public void remarcar_horario(double valor){
        this.horario= valor;
    }
    public void remarcar_data(String valor){
        this.data= valor;
    }




}
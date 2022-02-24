public class App {
    public static void main(String[] args) throws Exception {
        
        
            
     horario horar= new horario();
     
        horar.horario= 00.00;
        horar.data="";
        horar.marcar_horario(12.00); 
        horar.marcar_data("24/02");
        //System.out.print(horar.data+" ");
        //System.out.println(horar.horario);

    horario horar1= new horario();
     
        horar1.horario= 00.00;
        horar1.data="";
        horar1.marcar_horario(14.00); 
        horar1.marcar_data("24/02");
        //System.out.print(horar1.data+" ");
        //System.out.println(horar1.horario );
        

    horario horar2= new horario();
     
        horar2.horario= 00.00;
        horar2.data="";
        horar2.marcar_horario(16.00); 
        horar2.marcar_data("24/02");
        //System.out.print(horar2.data+" ");
        //System.out.println(horar2.horario);
    
    procedimento limpeza= new procedimento();

        limpeza.preco=0.0;
        limpeza.doutor="";
        limpeza.horario=0.0;
        limpeza.data="";
        limpeza.horario_procedimento(horar2.horario);
        limpeza.data_procedimento(horar2.data);
        //System.out.println(limpeza.horario);
        //System.out.println(limpeza.data);

    procedimento canal= new procedimento();
        canal.preco=0.0;
        canal.doutor="";
        canal.horario=0.0;
        canal.data="";
        canal.horario_procedimento(horar1.horario);
        canal.data_procedimento(horar1.data);
        System.out.println(canal.horario);
        System.out.println(canal.data);
       
       
       
       
       
       
       
       
       
          

    }
}
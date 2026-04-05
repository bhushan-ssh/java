public class Employee {
    String name;
    String[] projects; 

    public Employee(String name,String[] projects ){
        this.name=name;
        this.projects=projects;
    }
    public Employee(Employee e){
        this.name=e.name;
        
        String[] temp=new String[10];
        for (int i=0;i<e.projects.length;i++){
              temp[i]=e.projects[i];        `
              
        }
        this.projects=temp;
    }
}

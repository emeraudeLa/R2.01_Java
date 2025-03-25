public class Cours {
    
    public String intitule;
    
    public Cours (String intitule){
        this.intitule=intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public boolean equals(Cours nom){
        if(nom.getIntitule().equals(intitule)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Intitule = "+intitule;
    }
  
} 
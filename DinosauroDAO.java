public interface DinosauroDAO{
    //metodi astratti che verranno implementati da un altra classe
    void crea(Dinosauro dino); //create

    Dinosauro trova(String nome); //read

    void nutri(); //update

    void cura(); //update

    void vendi(Dinosauro dinoDaVendere); //delete

}
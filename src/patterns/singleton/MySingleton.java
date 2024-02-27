package patterns.singleton;

public class MySingleton {
    private static MySingleton instance = null;
    private String atributeTest = "";

    private MySingleton(){

    }

    public static MySingleton getInstance(){
        if(MySingleton.instance == null){
            MySingleton.instance = new MySingleton();
        }

        return MySingleton.instance;
    }

    public String getAtributeTest() { return atributeTest; }
    
    public void setAtributeTest(String atributeTest) {
        this.atributeTest = atributeTest;
    }
}

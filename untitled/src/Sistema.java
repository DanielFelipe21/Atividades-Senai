public class Sistema implements Runnable {
    private String nome;

    public void setNome(String nome) {
        nome = nome;
    }

    public String getNome() {
        return nome;
    }



    public synchronized  void iniciarSistema()
    {
        int i = 0;
        while (i < 10)
        {
            System.out.println("Sistema executado por " + nome +"!");
        }
    }
    public void run()
    {
        iniciarSistema();
    }

}




class Main{
    public static void main(String[] args){
        final String SUCCESS_MESSAGE = new String("Program runs successfully!");
        System.out.println(SUCCESS_MESSAGE);
    }
}

class Mamalia {
    int jumlahKaki;
    String reproduksi;
    boolean gender; // 0 = male, 1 = female
    String jenis;
    int umur;

    public void merangkak(){}
    public void memakan(){}
    public void reproduksi(){}
    public void melahirkan(){
        if (!this.gender) return;
    }
}

class Kerbau extends Mamalia{
    boolean tanduk;
    float panjangTanduk;

    private void menyeruduk(){}
    private void menendang(){}
}

class Gajah extends Mamalia{
    boolean gading;
    float panjangBelalai;

    private void menginjak(){}
}

class Harimau extends Mamalia {
    String corak;
    String[] variasiWarna;

    private void menerkam(){}
    private void memangsa(){}
    private void menyakar(){}
}

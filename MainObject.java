import java.util.ArrayList;

public class MainObject {

        ArrayList<Mahasiswa> mahasis;
        public MainObject(){
            mahasis = new ArrayList<>();
        }

        public void isiData (String nama, String nim, String kelas, String alamat){
            mahasis.add(new Mahasiswa(nama, nim, kelas, alamat));
        }
        public void showData(){
            for(Mahasiswa mahasiswa:mahasis){
                System.out.println("nama : "+ mahasiswa.getNama() +"NIM : "+ mahasiswa.getNim() +"Kelas : "+ mahasiswa.getKelas() +"Alamat : "+ mahasiswa.getAlamat());
            }
        }
        public static void main(String[] args){
            MainObject tt = new MainObject();

            tt.isiData("ahmad", "23597", "C", "Mamuju");
            tt.isiData("ahmid", "2968", "C", "MARSHAL");
            tt.isiData("ahmud", "597579", "C", "mamuju");
            tt.isiData("ahmed", "59865698", "C", "sulteng");

            td.showData();
        }

}

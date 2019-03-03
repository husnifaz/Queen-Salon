package salon.indeks;

import javax.swing.table.DefaultTableModel;
import salon.indeks.regist;

/**
 *
 * @author Muhammad Husni Farid
 */
public class diskon {
    private double diskon=0;
    private DefaultTableModel tabel = new DefaultTableModel();
    private double txtharga2;


    public double hitung() {
        diskon=txtharga2*0.1;
        return diskon;
}
    
}

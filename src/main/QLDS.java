
package main;
import java.util.ArrayList;

public class QLDS implements IQLDS{
    private ArrayList<CaNhan> DSQl = new ArrayList<>();
    
    @Override
    public int them(CaNhan cn){
        DSQl.add(cn);
        return 0;
    }
    
    @Override
    public int xoa(String ten){
        for(int i = 0; i < DSQl.size(); i++)
            if(DSQl.get(i).hoTen.equals(ten) == true)
                DSQl.remove(i);
        return 0;
    }
    
    @Override
    public void inDS(){
        for(int i = 0; i < DSQl.size(); i++)
            System.out.println(DSQl.get(i).HienThiTT());
    }
}

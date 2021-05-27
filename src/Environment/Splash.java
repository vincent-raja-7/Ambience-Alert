/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment;

/**
 *
 * @author King Vincent
 */
public class Splash {
    public static void main(String[] args)throws InterruptedException
    {
        Progress p=new Progress();
        for(int i=0;i<=100;i++)
        {
            Thread.sleep(40);
            p.setVisible(true);
            p.Loading.setText("Loading..."+i+"%");
            p.Load.setValue(i);
            if(i==100)
            {
               Login v=new Login();
               v.setVisible(true);
               p.setVisible(false);
               
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafics;

import Abstract.Vehicule;
import Entities.BankingEntitie;
import Entities.BillBank;
import Entities.BillBuyer;
import Entities.BranchOffice;
import Entities.Buyer;
import Entities.Purchases;
import Entities.Debts;
import Entities.Seler;
import static Grafics.Login.userMet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class buyWithBank extends javax.swing.JFrame {

    DefaultTableModel show;
    
    public  Buyer  persona;
    public  BranchOffice   sucursal;
    /**
     * Creates new form buyWithBank
     */
    public buyWithBank() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setForeground(new java.awt.Color(204, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Comprar Por Financiamineto Bancario");

        jLabel2.setText("Nombre del Banco ");

        jLabel3.setText("Placa del Vehiculo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Listado de Bancos ");

        jButton3.setText("Comprar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Ingresar Tarjeta");

        jLabel6.setText("Numero");

        jLabel7.setText("Codigo ");

        jLabel8.setText("Fecha de Vencimiento");

        jComboBox1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBox1MouseMoved(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(0, 153, 153));
        jLabel33.setText("Dia");

        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("Mes");

        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("Año");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafics/Imagenes/Banco.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 8, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login.BU.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printBanks();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            String bankName= (String) jComboBox1.getSelectedItem();
            int    placa=Integer.parseInt(jTextField2.getText());
            
            int number=Integer.parseInt(jTextField3.getText());
            int ping=Integer.parseInt(jTextField4.getText());
            String dia=(String) jComboBox4.getSelectedItem();
            String mes=(String) jComboBox5.getSelectedItem();
            String año=(String) jComboBox6.getSelectedItem();
            String fecha=dia+"/"+mes+"/"+año;
            
            
    
                if(persona != null)
                {
                    boolean verifyCard=veriCardPersona(number,ping,fecha);
                    if(verifyCard == true) 
                    {
                     buyWithBank_Person(bankName,placa);
                    }
                }
                else
                {
                    boolean verifyCard=veriCardSucursal(number,ping,fecha);
                    if(verifyCard == true) 
                    {
                     buyWithBank_Sucursal(bankName,placa);
                    }
                }
   
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro de datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public boolean veriCardSucursal(int number,int ping,String fecha)
    {
        int cardNumber=sucursal.getCard().getNumber();
        int cardPing=sucursal.getCard().getPing();
        String cardFecha=sucursal.getCard().getDueDate();
        if(cardNumber == number)
        {
            if(cardPing==ping  )
            {
                
                if( cardFecha.equals(fecha) )
                {
                    return true;
                }
            }
            
        }

        return false;
        
    }
    
    public boolean veriCardPersona(int number,int ping,String fecha)
    {
        int cardNumber=persona.myCard.get(0).getNumber();
        int cardPing=persona.myCard.get(0).getPing();
        String cardFecha=persona.myCard.get(0).getDueDate();
        if(cardNumber == number)
        {
            if(cardPing==ping  )
            {
                
                if( cardFecha.equals(fecha) )
                {
                    return true;
                }
            }
            
        }

        return false;
        
    }
    
    static int cont=0;
    private void jComboBox1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseMoved

        if(cont==0)
        {
            cont++;
            bancos();
        }
    }//GEN-LAST:event_jComboBox1MouseMoved

    public void bancos()
    {
        for(BankingEntitie i : Login.metBank.allBanks)
        {
            jComboBox1.addItem(i.getName());
        }
    }
    public void buyWithBank_Person(String bankName,int placa)
    {
        Vehicule auto=verifyCar(placa);
        BankingEntitie banco=verifyBanks(bankName);
        
        if( auto != null && banco != null)
            {
                //1.Saber cual usuario soy ..................................... listo
                //2.Saber el antiguo propietario del vehiculo................... listo
                //3.Verificar si aporta el 25% del precio del auto.............. listo
                //3.5 Verifico si  si el comprador tiene el suficiente dinero para cubrir el 25%
                //4.Comprarlo
                //5.Guardar la Facatura en el banco
                //6.Agregarlo a la lista de autos del propietario
                //7.Agregarlo a la  lista de deudas del propietario
               
                Seler seler=userMet.ReturnObjetSeler(auto.getIncharge()); // me retorna el vendedor
                long porcentBank=Login.metBank.calculate25Percent(auto.getPrice()); //obtengo el  25% precio del auto
                long moneyBuyer=persona.myCard.get(0).getMoney();// obtengo el dinero del comprador
                
                if(moneyBuyer > porcentBank )
                {
                    Calendar cal=Calendar.getInstance(); 
                    int actualYear= cal.get(Calendar.YEAR); 
                    
                    int maximunYear=actualYear-banco.getYearLastFinancialModel();
                    
                    if( auto.getModel() >  maximunYear)
                    {

                        auto.setIncharge(persona.getName());// cambio el nombre del propietario el auto
                        persona.boughtCars.add(auto);// add the vehicle in my list to buy
                        Login.selerMet.selerVehiculesList.remove(auto);//lo remuevo de la lista del comprador
                        Login.vehiculesMet.vehiculesList.remove(auto); //delate of all sistem 
                        seler.deleteCar(auto.getLicensePlate());//delate of list of seler
                        persona.myCard.get(0).setMoney(persona.myCard.get(0).getMoney()-porcentBank);
                        
                        BillBank nuevo =new BillBank(banco.getName(),persona.getName(),seler.getName(),auto.getNewOrused(),auto.getPrice(),porcentBank,auto.getPrice()-porcentBank,banco.getYearLastFinancialModel(),auto.getPrice()*banco.getInterestRateUsed()/100,porcentBank,auto.getPrice());
                        banco.Prestamos.add(nuevo);
                        
                        //agregar a record
                        BillBuyer  nuevoBill=new BillBuyer(persona.getName(),seler.getName(),auto.getNewOrused(),auto.getPrice(),auto.getLicensePlate(),auto.getBrand());
                        persona.record.add(nuevoBill);// agrego a mi historial de compras 
                       
                        // agrego a todas las compras
                        Purchases nuevoPurhase = new Purchases(auto.getType(),auto.getBrand(),auto.getLicensePlate(),auto.getPrice());
                        persona.purchases.add(nuevoPurhase);
                        
                        //agrego a lista de deudas
                        long debt=auto.getPrice()-porcentBank;
                        Debts nuevoDebts = new Debts(auto.getType(),auto.getBrand(),banco.getName(),debt);
                        persona.debts.add(nuevoDebts);
                        
                        JOptionPane.showMessageDialog(null,"Factura: "+"\n"+"Nombre Banco: "+nuevo.getNameBank()+"\n"+"Vendedor: "+nuevo.getNameSeler()+"\n"+"Comprador: "+nuevo.getNameBuyer()+"\n"+"Porcentaje de Prestamo: "+nuevo.getBonus()+"\n"+"Precio de Vehiculo: "+nuevo.getPriceAuto());
                    }                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No posee el suficiente dinero para financiar el auto");
                }
            }
        else
        {
            JOptionPane.showMessageDialog(null,"Verifique los datos ingresados");
        }
        
    }
    
    public void buyWithBank_Sucursal(String bankName,int placa)
    {
        Vehicule auto=verifyCar(placa);
        BankingEntitie banco=verifyBanks(bankName);
        
        if( auto != null && banco != null)
            {
                //1.Saber cual usuario soy ..................................... listo
                //2.Saber el antiguo propietario del vehiculo................... listo
                //3.Verificar si aporta el 25% del precio del auto.............. listo
                //3.5 Verifico si  si el comprador tiene el suficiente dinero para cubrir el 25%
                //4.Comprarlo
                //5.Guardar la Facatura en el banco
                //6.Agregarlo a la lista de autos del propietario
                //7.Agregarlo a la  lista de deudas del propietario
               
                Seler seler=userMet.ReturnObjetSeler(auto.getIncharge()); // me retorna el vendedor
                long porcentBank=Login.metBank.calculate25Percent(auto.getPrice()); //obtengo el  25% precio del auto
                long moneyBuyer=sucursal.getCard().getMoney();// obtengo el dinero del comprador
                
                if(moneyBuyer > porcentBank )
                {
                    Calendar cal=Calendar.getInstance();  
                    int actualYear= cal.get(Calendar.YEAR); 
                    
                    int maximunYear=actualYear-banco.getYearLastFinancialModel();
                    
                    if( auto.getModel() >  maximunYear)
                    {

                        auto.setIncharge(sucursal.getName());// cambio el nombre del propietario el auto
                        sucursal.boughtCars.add(auto);// add the vehicle in my list to buy
                        Login.selerMet.selerVehiculesList.remove(auto);//lo remuevo de la lista del comprador
                        Login.vehiculesMet.vehiculesList.remove(auto); //delate of all sistem 
                        seler.deleteCar(auto.getLicensePlate());//delate of list of seler
                        sucursal.getCard().setMoney(sucursal.getCard().getMoney()-porcentBank);
                        
                        BillBank nuevo =new BillBank(banco.getName(),sucursal.getName(),seler.getName(),auto.getNewOrused(),auto.getPrice(),porcentBank,auto.getPrice()-porcentBank,banco.getYearLastFinancialModel(),auto.getPrice()*banco.getInterestRateUsed()/100,porcentBank,auto.getPrice());
                        banco.Prestamos.add(nuevo);
                       
                        //agregar a record
                        BillBuyer  nuevoBill=new BillBuyer(sucursal.getName(),seler.getName(),auto.getNewOrused(),auto.getPrice(),auto.getLicensePlate(),auto.getBrand());
                        sucursal.record.add(nuevoBill);// agrego a mi historial de compras 
                        
                        // agrego a todas las compras
                        Purchases nuevoPurhase = new Purchases(auto.getType(),auto.getBrand(),auto.getLicensePlate(),auto.getPrice());
                        sucursal.purchases.add(nuevoPurhase);
                        
                        //agrego a lista de deudas
                        long debt=auto.getPrice()-porcentBank;
                        Debts nuevoDebts = new Debts(auto.getType(),auto.getBrand(),banco.getName(),debt);
                        sucursal.debts.add(nuevoDebts);
                        
                        JOptionPane.showMessageDialog(null,"Factura: "+"\n"+"Nombre Banco: "+nuevo.getNameBank()+"\n"+"Vendedor: "+nuevo.getNameSeler()+"\n"+"Comprador: "+nuevo.getNameBuyer()+"\n"+"Porcentaje de Prestamo: "+nuevo.getBonus()+"\n"+"Precio de Vehiculo: "+nuevo.getPriceAuto());
                    }                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No posee el suficiente dinero para financiar el auto");
                }
            }
        else
        {
            JOptionPane.showMessageDialog(null,"Verifique los datos ingresados");
        }
        
    }

    public BankingEntitie verifyBanks(String name) 
    {
        for(BankingEntitie i : Login.metBank.allBanks)
        {
            if(i.getName().equals(name))
            {
                return i;
            }
        }
        return null;
    }
   public Vehicule verifyCar(int placa)
   {
       for(Vehicule i: Login.vehiculesMet.vehiculesList)
       {
           if( i.getLicensePlate()== placa)
           {
               return i;
           }
       }
       return null;
   }
    public void printBanks() {
        String titulo[]={"Nombre","Tasa Usados","Tasa Nuevos","Antiguedad Maxima "};
        String datos[][]={};
        show=new DefaultTableModel(datos,titulo);     
        jTable1.setModel(show);
        
        for(BankingEntitie i : Login.metBank.allBanks)
        {
            Object dato[]={i.getName(),i.getInterestRateUsed()+"%",i.getInterestRateNew()+"%",i.getYearLastFinancialModel()+" años"};
            show.addRow(dato);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buyWithBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyWithBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyWithBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyWithBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyWithBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

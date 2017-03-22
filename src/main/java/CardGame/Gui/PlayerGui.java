package CardGame.Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Alex on 18/03/2017.
 */
public class PlayerGui extends JPanel {

    private JLabel lblAvatar;
    private JLabel lblName;
    private JLabel lblBetAmount;
    private JLabel lblCredits;

    private JLabel lblCard1;
    private JLabel lblCard2;
    private JLabel lblCard3;
    private JLabel lblCard4;
    private JLabel lblCard5;
    private JLabel lblCard6;
    private JLabel lblCard7;
    private JLabel lblCard8;
    private JLabel lblCard9;
    private JLabel lblCard10;
    private JLabel lblCard11;
    private JLabel lblCard12;

    public PlayerGui(){
        setOpaque(false);
        createPlayerComponents();
        setLblAvatar("0");
        setLblName("username");
        setLblBetAmount("to bet...");
        setLblBudget("credits");
        setPlayerBounds();
        addPlayerComponents();
        createCards();
        setPlayerCardBounds();
        initialize();
    }

    /**
     * Creates a new player with specified avatar, if 1 is given a dealerGui is made
     */
    public PlayerGui(String avatarID){
        setOpaque(false);
        if (avatarID =="1"){
            createDealerComponents();
            setLblName("Dealer");
            setDealerBounds();
            addDealerComponents();
            createCards();
            setDealerCardBounds();
        } else {
            createPlayerComponents();
            setLblName("username");
            setLblBetAmount("amount to bet");
            setLblBudget("credits");
            setPlayerBounds();
            addPlayerComponents();
            createCards();
            setPlayerCardBounds();
        }
        setLblAvatar(avatarID);
        initialize();
    }

    public void initialize() {

        setLayout(null);
        setSize(new Dimension(200,200));

    }

    public void createCards(){
        lblCard1 = new JLabel();
        lblCard2 = new JLabel();
        lblCard3 = new JLabel();
        lblCard4 = new JLabel();
        lblCard5 = new JLabel();
        lblCard6 = new JLabel();
        lblCard7 = new JLabel();
        lblCard8 = new JLabel();
        lblCard9 = new JLabel();
        lblCard10 = new JLabel();
        lblCard11 = new JLabel();
        lblCard12 = new JLabel();
    }


    public void setPlayerCardBounds(){
        lblCard1.setBounds(0, 0, 64, 93);
        lblCard2.setBounds(25, 2, 64, 93);
        lblCard3.setBounds(50, 4, 64, 93);
        lblCard4.setBounds(75, 6, 64, 93);
        lblCard5.setBounds(100, 8, 64, 93);
        lblCard6.setBounds(125, 10, 64, 93);
        lblCard7.setBounds(100, 38, 64, 93);
        lblCard8.setBounds(125, 40, 64, 93);
        lblCard9.setBounds(100, 68, 64, 93);
        lblCard10.setBounds(125, 70, 64, 93);
        lblCard11.setBounds(100, 98, 64, 93);
        lblCard12.setBounds(125, 100, 64, 93);
    }

    public void setDealerCardBounds(){
        lblCard1.setBounds(0, 0, 64, 93);
        lblCard2.setBounds(25, 2, 64, 93);
        lblCard3.setBounds(0, 30, 64, 93);
        lblCard4.setBounds(25, 32, 64, 93);
        lblCard5.setBounds(0, 60, 64, 93);
        lblCard6.setBounds(25, 62, 64, 93);
        lblCard7.setBounds(0, 90, 64, 93);
        lblCard8.setBounds(25, 92, 64, 93);
        lblCard9.setBounds(50, 94, 64, 93);
        lblCard10.setBounds(75, 96, 64, 93);
        lblCard11.setBounds(100, 98, 64, 93);
        lblCard12.setBounds(125, 100, 64, 93);
    }

    public void setPlayerBounds(){
        lblAvatar.setBounds(10, 60, 64, 64);
        lblName.setBounds(0, 124, 94, 20);
        lblCredits.setBounds(0, 164, 94, 20);
        lblBetAmount.setBounds(0, 144, 94, 20);
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblCredits.setHorizontalAlignment(SwingConstants.CENTER);
        lblBetAmount.setHorizontalAlignment(SwingConstants.CENTER);
    }


    public void createPlayerComponents(){
        lblAvatar = new JLabel();
        lblName = new JLabel();
        lblBetAmount = new JLabel();
        lblCredits = new JLabel();
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblName.setForeground(Color.BLACK);
        lblName.setBackground(Color.WHITE);
        lblName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblName.setOpaque(true);
        lblBetAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBetAmount.setForeground(Color.BLACK);
        lblBetAmount.setBackground(Color.WHITE);
        lblBetAmount.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblBetAmount.setOpaque(true);
        lblCredits.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblCredits.setForeground(Color.BLACK);
        lblCredits.setBackground(Color.WHITE);
        lblCredits.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblCredits.setOpaque(true);
    }

    public void addPlayerComponents(){
        add(lblAvatar);
        add(lblName);
        add(lblBetAmount);
        add(lblCredits);
    }

    public void setDealerBounds(){
        lblAvatar.setBounds(100, 0, 64, 64);
        lblName.setBounds(100, 64, 64, 20);
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void createDealerComponents(){
        lblAvatar = new JLabel();
        lblName = new JLabel();
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblName.setBackground(Color.WHITE);
        lblName.setForeground(Color.BLACK);
        lblName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblName.setOpaque(true);
    }

    public void addDealerComponents(){
        add(lblAvatar);
        add(lblName);
    }

    public void setLblName(String username){
        lblName.setText(username);
    }

    public void setLblBudget(String credits){
        lblCredits.setText(credits);
    }

    public void setLblBetAmount(String betAmount){
        lblBetAmount.setText(betAmount);
    }

    public void setLblAvatar(String avatarID) {
        remove(lblAvatar);
        try {
            Image imgAvatar = ImageIO.read(getClass().getResource("/avatars/"+avatarID+".png"));
            lblAvatar.setIcon(new ImageIcon(imgAvatar));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        add(lblAvatar);
    }

    public void setLblCard1(String cardID){
        remove(lblCard1);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard1.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard1);
    }

    public void setLblCard2(String cardID) {
        remove(lblCard2);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard2.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard2);
    }
    public void setLblCard3(String cardID) {
        remove(lblCard3);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard3.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard3);
    }

    public void setLblCard4(String cardID) {
        remove(lblCard4);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard4.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard4);
    }

    public void setLblCard5(String cardID) {
        remove(lblCard5);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard5.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard5);
    }

    public void setLblCard6(String cardID) {
        remove(lblCard6);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard6.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard6);
    }

    public void setLblCard7(String cardID) {
        remove(lblCard7);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard7.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard7);
    }

    public void setLblCard8(String cardID) {
        remove(lblCard8);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard8.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard8);
    }

    public void setLblCard9(String cardID) {
        remove(lblCard9);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard9.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard9);
    }

    public void setLblCard10(String cardID) {
        remove(lblCard10);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard10.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard10);
    }

    public void setLblCard11(String cardID) {
        remove(lblCard11);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard11.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard11);
    }

    public void setLblCard12(String cardID) {
        remove(lblCard12);
        try {
            Image imgCard = ImageIO.read(getClass().getResource("/cards/"+cardID+".png"));
            lblCard12.setIcon(new ImageIcon(imgCard));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(lblCard12);
    }

}
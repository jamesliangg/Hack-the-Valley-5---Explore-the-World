import javax.swing.JOptionPane; //fancy GUI
import javax.swing.ImageIcon; //image icons

class Main {
  public static void main(String[] args) {
    String city = null;
    int confirmCity = 0;

    ImageIcon earthicon = new ImageIcon("images/earth.png");
    ImageIcon torontoicon = new ImageIcon("images/toronto.png");
    ImageIcon newyorkicon = new ImageIcon("images/newyork.png");
    ImageIcon pisaicon = new ImageIcon("images/pisa.png");
    ImageIcon egypticon = new ImageIcon("images/egypt.png");
    ImageIcon parisicon = new ImageIcon("images/paris.png");
    ImageIcon sanfranicon = new ImageIcon("images/sanfran.png");

    JOptionPane.showMessageDialog(null, "Welcome to Explore the World!", "Explore the World", JOptionPane.INFORMATION_MESSAGE, earthicon);
    JOptionPane.showMessageDialog(null, "This program will show you the amazing buildings from across the world.", "Explore the World", JOptionPane.INFORMATION_MESSAGE, earthicon);

      while (confirmCity != 1)
      {
        String[] cityChoices = {"Toronto", "New York City", "Pisa", "Egypt", "Paris", "San Francisco"};
        city = (String) JOptionPane.showInputDialog(null, "Pick a city to learn more about.", "City Options", JOptionPane.QUESTION_MESSAGE, null, cityChoices, cityChoices[0]);

        System.out.println(city);

        if (city == "Toronto")
        {
            JOptionPane.showMessageDialog(null, "Toronto is known for the CN Tower,\nscan the QR Code to see it in AR", "Toronto", JOptionPane.INFORMATION_MESSAGE, torontoicon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        else if (city == "New York City")
        {
            JOptionPane.showMessageDialog(null, "New York City is known for the Empire State Building,\nscan the QR Code to see it in AR", "New York City", JOptionPane.INFORMATION_MESSAGE, newyorkicon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        else if (city == "Pisa")
        {
            JOptionPane.showMessageDialog(null, "Pisa is known for the Leaning Tower of Pisa,\nscan the QR Code to see it in AR", "Pisa", JOptionPane.INFORMATION_MESSAGE, pisaicon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        else if (city == "Egypt")
        {
            JOptionPane.showMessageDialog(null, "Egypt is known for the Giza Pyramids,\nscan the QR Code to see it in AR", "Egypt", JOptionPane.INFORMATION_MESSAGE, egypticon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        else if (city == "Paris")
        {
            JOptionPane.showMessageDialog(null, "Paris is known for the Eiffel Tower,\nscan the QR Code to see it in AR", "Paris", JOptionPane.INFORMATION_MESSAGE, parisicon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        else if (city == "San Francisco")
        {
            JOptionPane.showMessageDialog(null, "San Francisco is known for the Golden Gate Bridge,\nscan the QR Code to see it in AR", "San Francisco", JOptionPane.INFORMATION_MESSAGE, sanfranicon);
            confirmCity = JOptionPane.showConfirmDialog(null, "Would you like to explore a different city?", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
      }
    JOptionPane.showMessageDialog(null, "Thank you for using Explore the World!", "Explore the World", JOptionPane.INFORMATION_MESSAGE, earthicon);
    System.exit(0);
  }
}
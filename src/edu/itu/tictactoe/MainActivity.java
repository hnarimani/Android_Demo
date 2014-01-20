package edu.itu.tictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private int selected = 0;
	private int count = 0;
	private boolean win = false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void ButtonOnClick(View v) {
        switch (v.getId()) {
          case R.id.imageButton1:
        	  selected = 1;
          Calculate();  
        	  break;
          case R.id.imageButton2:
        	  selected = 2;
          Calculate();
          break;
          case R.id.imageButton3:
        	  selected = 3;
          Calculate();
          break;
          case R.id.imageButton4:
        	  selected = 4;
          Calculate();  
        	  break;
          case R.id.imageButton5:
        	  selected = 5;
          Calculate();
          break;
          case R.id.imageButton6:
        	  selected = 6;
          Calculate();
          break;
          case R.id.imageButton7:
        	  selected = 7;
          Calculate();  
        	  break;
          case R.id.imageButton8:
        	  selected = 8;
          Calculate();
          break;
          case R.id.imageButton9:
        	  selected = 9;
          Calculate();
          break;
          }
    }
      
    public void Calculate()
    {
    	count++;
    	ImageButton Button1 = (ImageButton)findViewById(R.id.imageButton1);
    	ImageButton Button2 = (ImageButton)findViewById(R.id.imageButton2);
    	ImageButton Button3 = (ImageButton)findViewById(R.id.imageButton3);
    	ImageButton Button4 = (ImageButton)findViewById(R.id.imageButton4);
    	ImageButton Button5 = (ImageButton)findViewById(R.id.imageButton5);
    	ImageButton Button6 = (ImageButton)findViewById(R.id.imageButton6);
    	ImageButton Button7 = (ImageButton)findViewById(R.id.imageButton7);
    	ImageButton Button8 = (ImageButton)findViewById(R.id.imageButton8);
    	ImageButton Button9 = (ImageButton)findViewById(R.id.imageButton9);
    	
    	/*Calculate Who's Turn It Is*/
    	if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
    	
    switch (selected)
    {
    case 1: Button1.setImageResource(R.drawable.x); Button1.setContentDescription("x"); Button1.setEnabled(false); break;
    case 2: Button2.setImageResource(R.drawable.x); Button2.setContentDescription("x"); Button2.setEnabled(false); break;
    case 3: Button3.setImageResource(R.drawable.x); Button3.setContentDescription("x"); Button3.setEnabled(false); break;
    case 4: Button4.setImageResource(R.drawable.x); Button4.setContentDescription("x"); Button4.setEnabled(false); break;
    case 5: Button5.setImageResource(R.drawable.x); Button5.setContentDescription("x"); Button5.setEnabled(false); break;
    case 6: Button6.setImageResource(R.drawable.x); Button6.setContentDescription("x"); Button6.setEnabled(false); break;
    case 7: Button7.setImageResource(R.drawable.x); Button7.setContentDescription("x"); Button7.setEnabled(false); break;
    case 8: Button8.setImageResource(R.drawable.x); Button8.setContentDescription("x"); Button8.setEnabled(false); break;
    case 9: Button9.setImageResource(R.drawable.x); Button9.setContentDescription("x"); Button9.setEnabled(false); break;
    }
    	
    	} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
 
    	switch (selected)
    	{
    	case 1: Button1.setImageResource(R.drawable.o); Button1.setContentDescription("o"); Button1.setEnabled(false); break;
    	case 2: Button2.setImageResource(R.drawable.o); Button2.setContentDescription("o"); Button2.setEnabled(false); break;
    case 3: Button3.setImageResource(R.drawable.o); Button3.setContentDescription("o"); Button3.setEnabled(false); break;
    	case 4: Button4.setImageResource(R.drawable.o); Button4.setContentDescription("o"); Button4.setEnabled(false); break;
    	case 5: Button5.setImageResource(R.drawable.o); Button5.setContentDescription("o"); Button5.setEnabled(false); break;
    	case 6: Button6.setImageResource(R.drawable.o); Button6.setContentDescription("o"); Button6.setEnabled(false); break;
    	case 7: Button7.setImageResource(R.drawable.o); Button7.setContentDescription("o"); Button7.setEnabled(false); break;
    	case 8: Button8.setImageResource(R.drawable.o); Button8.setContentDescription("o"); Button8.setEnabled(false); break;
    	case 9: Button9.setImageResource(R.drawable.o); Button9.setContentDescription("o"); Button9.setEnabled(false); break;
    }	
    	} 
    	
    	// check for a winner after each turn
    	
    	    //horizontal wins
    	  if( Button1.getContentDescription() == Button2.getContentDescription() && Button2.getContentDescription() == Button3.getContentDescription() && Button1.getContentDescription() != ""){
    	  win = true;
    	  
    	  }
    	  else if(Button4.getContentDescription() == Button5.getContentDescription() && Button5.getContentDescription() == Button6.getContentDescription() && Button4.getContentDescription() != ""){
    	  win = true;
    	  }
    	  else if(Button7.getContentDescription() == Button8.getContentDescription() && Button8.getContentDescription() == Button9.getContentDescription() && Button7.getContentDescription() != ""){
    	  win = true;
    	  }

    	    //Vertical wins
    	  else if(Button1.getContentDescription() == Button4.getContentDescription() && Button4.getContentDescription() == Button7.getContentDescription() && Button1.getContentDescription() != ""){
    	  win = true;
    	  }
    	  else if(Button2.getContentDescription() == Button5.getContentDescription() && Button5.getContentDescription() == Button8.getContentDescription() && Button2.getContentDescription() != ""){
    	  win = true;
    	  }
    	  else if(Button3.getContentDescription() == Button6.getContentDescription() && Button6.getContentDescription() == Button9.getContentDescription() && Button3.getContentDescription() != ""){
    	  win = true;
    	  }

    	  //diagonal wins
    	  else if(Button1.getContentDescription() == Button5.getContentDescription() && Button5.getContentDescription() == Button9.getContentDescription() && Button1.getContentDescription() != ""){
    	  win = true;
    	  }
    	  else if(Button3.getContentDescription() == Button5.getContentDescription() && Button5.getContentDescription() == Button7.getContentDescription() && Button3.getContentDescription() != ""){
    	  win = true;
    	  }
    	  else {
    	  win = false;
    	  }
    	  
    	  AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
    	  
    	  /*Show a dialog if someone wins or the game is a tie*/
    	  if(win == true){
    			if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
    		      dlgAlert.setTitle("Lucas Won!");
    		      dlgAlert.setPositiveButton("Good Job Lucas Let Play again Baby",
    		    		    new DialogInterface.OnClickListener() {
    		    		        public void onClick(DialogInterface dialog, int which) {
    		    		          resetBoard();
    		    		        }
    		    		    });
    		      dlgAlert.show();
    		      
    			} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
    				dlgAlert.setTitle("Anthony Won!");
      		      dlgAlert.setPositiveButton("Great Job Big Boy Anthony , Lets Play Again My Man",
      		    		    new DialogInterface.OnClickListener() {
      		    		        public void onClick(DialogInterface dialog, int which) {
      		    		          resetBoard();
      		    		        }
      		    		    });
      		      dlgAlert.show();
    		   	}
  
    	  } else if(count == 9 && win == false){
    		  dlgAlert.setTitle("Momy Fart,Tie Game!");
		      dlgAlert.setPositiveButton("Ok",
		    		    new DialogInterface.OnClickListener() {
		    		        public void onClick(DialogInterface dialog, int which) {
		    		          resetBoard();
		    		        }
		    		    });
		      dlgAlert.show();
    	  }  }   	  
    	  
    void resetBoard()   
    {
      	count = 0;
     	selected = 0;
     	win = false;
    	
     	ImageButton Button1 = (ImageButton)findViewById(R.id.imageButton1);
     	ImageButton Button2 = (ImageButton)findViewById(R.id.imageButton2);
     	ImageButton Button3 = (ImageButton)findViewById(R.id.imageButton3);
     	ImageButton Button4 = (ImageButton)findViewById(R.id.imageButton4);
     	ImageButton Button5 = (ImageButton)findViewById(R.id.imageButton5);
    	ImageButton Button6 = (ImageButton)findViewById(R.id.imageButton6);
     	ImageButton Button7 = (ImageButton)findViewById(R.id.imageButton7);
     	ImageButton Button8 = (ImageButton)findViewById(R.id.imageButton8);
     	ImageButton Button9 = (ImageButton)findViewById(R.id.imageButton9);
    	
     	Button1.setImageResource(R.drawable.blank); 
     	Button1.setContentDescription("button1");
     	Button1.setEnabled(true);
    	
     	Button2.setImageResource(R.drawable.blank); 
     	Button2.setContentDescription("button2");
     	Button2.setEnabled(true);
     	
     	Button3.setImageResource(R.drawable.blank); 
     	Button3.setContentDescription("button3");
     	Button3.setEnabled(true);
     	
     	Button4.setImageResource(R.drawable.blank); 
     	Button4.setContentDescription("button4");
     	Button4.setEnabled(true);
 
     	Button5.setImageResource(R.drawable.blank); 
     	Button5.setContentDescription("button5");
     	Button5.setEnabled(true);
     	
     	Button6.setImageResource(R.drawable.blank); 
     	Button6.setContentDescription("button6");
     	Button6.setEnabled(true);
     	
     	Button7.setImageResource(R.drawable.blank); 
     	Button7.setContentDescription("button7");
     	Button7.setEnabled(true);
     	
     	Button8.setImageResource(R.drawable.blank); 
     	Button8.setContentDescription("button8");
     	Button8.setEnabled(true);
     	
     	Button9.setImageResource(R.drawable.blank); 
     	Button9.setContentDescription("button9");
     	Button9.setEnabled(true);
    }
 
}
 

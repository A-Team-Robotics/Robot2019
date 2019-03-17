package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Delay2 extends Command{

    Timer waiting = new Timer();
    public Delay2(){
    }

    @Override
    protected void initialize() {   
        waiting.reset();
        waiting.start();      
    }

    @Override
    protected void execute() { 
      SmartDashboard.putNumber("Timer 2", waiting.get());
    }
    
    @Override
    protected boolean isFinished() {
      if(waiting.get()>0.1){
          SmartDashboard.putBoolean("Timer 2 Finished", true);
          return true;
      }else{
          return false;
      }
    }
}
package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Delay extends Command{

    Timer t = new Timer();
    public Delay(){
        t.reset();
    }

    @Override
    protected void initialize() {   
        t.reset();
        t.start();      
    }

    @Override
    protected void execute() { 
      SmartDashboard.putNumber("Timer", t.get());
    }
    
    @Override
    protected boolean isFinished() {
      if(t.get()>0.01){
          SmartDashboard.putBoolean("Timer Finished", true);
          return true;
      }else{
          return false;
      }
    }
}
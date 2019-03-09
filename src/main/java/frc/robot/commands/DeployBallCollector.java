package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
      //addSequential(new WaitElevatorLevel2());
       Timer.delay(1);
      addParallel(new Arm1Collect());
       addParallel(new Arm2Collect());
       Timer.delay(2);
       addParallel(new StartRollers());
    }
}
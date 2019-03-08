package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
      // addSequential(new ElevatorLevel2Hatch());
       Timer.delay(1);
       addParallel(new Arm1Collect());
        addParallel(new Arm2Collect());
Timer.delay(2);
       addSequential(new ExtendArmCollectors());
       addSequential(new StartRollers());
    }
}
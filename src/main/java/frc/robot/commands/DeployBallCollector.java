package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
        //addSequential(new ElevatorLevel2Hatch());
        Timer.delay(0.4);
        //addParallel(new Arm1Collect());
        addParallel(new Arm2Collect());
        //addSequential(new ExtendArmCollectors());
       // addSequential(new StartRollers());
    }
}
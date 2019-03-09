package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
       addSequential(new WaitElevatorLevel2(30000));
       Timer.delay(1);
       addParallel(new Arm2Collect(100));
       Timer.delay(4);
        addParallel(new Arm1Collect(18100));
       addSequential(new Arm2Collect(265));
       addParallel(new StartRollers());
    }
}
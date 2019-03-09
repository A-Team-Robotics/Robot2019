package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
       addSequential(new WaitElevatorLevel2(RobotMap.elevatorDeployBallPos));
       Timer.delay(1);
       addParallel(new Arm2Collect(RobotMap.arm2DeployS1));
       Timer.delay(4);
        addParallel(new Arm1Collect(RobotMap.arm1DeployS1));
       addSequential(new Arm2Collect(RobotMap.arm2DeployS2));
       addSequential(new StartRollers());
    }
}
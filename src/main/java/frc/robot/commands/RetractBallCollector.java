package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
        addParallel(new WaitElevatorRetract(RobotMap.elevatorDeployBallPos));
        addSequential(new WaitElevatorLevel2(RobotMap.elevatorDeployBallPos));
        Timer.delay(1);
        addSequential(new StopRollers());
        addParallel(new Arm1Retract(5));
        addSequential(new WaitArm2Retract(468));
        Timer.delay(0.4);
        addSequential(new ElevatorLoadCargo());
    }
}
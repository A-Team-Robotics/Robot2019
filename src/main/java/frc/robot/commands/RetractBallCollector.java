package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.RobotMap;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
        addSequential(new WaitElevatorToPos(Constants.elevatorLiftToClearGrippersPos));
        addParallel(new closeArm());
        addParallel(new StopArmRollers());
        addParallel(new WaitArm2ToPos(Constants.arm2RetractPos1));
        addSequential(new WaitArm1ToPos(Constants.arm1RetractPos1));
        addSequential(new WaitArm1AndArm2ToPos(Constants.arm1RetractPosFinal,Constants.arm2RetractPosFinal));
        //-addParallel(new WaitArm1ToPos(Constants.arm1RetractPosFinal));
        //-addParallel(new WaitArm2ToPos(Constants.arm2RetractPosFinal));     
        addSequential(new WaitElevatorToPos(Constants.elevatorBottomValue));
        addSequential(new TurnOffElevatorMotor());
    }
}
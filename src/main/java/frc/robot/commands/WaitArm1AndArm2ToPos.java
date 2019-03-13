package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.Constants;

public class WaitArm1AndArm2ToPos extends CommandGroup{
    public WaitArm1AndArm2ToPos(int Arm1Pos,int Arm2pos){
        addParallel(new WaitArm2ToPos(Arm2pos));
        addParallel(new WaitArm1ToPos(Arm1Pos));
    }
}
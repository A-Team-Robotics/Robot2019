package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class WaitArm1AndArm2ToPosBacks extends CommandGroup{
    public WaitArm1AndArm2ToPosBacks(int Arm1Pos,int Arm2pos){
        addParallel(new WaitArm2ToPos(Arm2pos));
        addParallel(new WaitArm1ToPos(Arm1Pos));
    }
}
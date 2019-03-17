package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class zfd extends CommandGroup {
    public zfd(int Arm1Pos, int Arm2pos) {
        addParallel(new WaitArm2ToBacks(Arm2pos));
        addParallel(new WaitArm1ToPosReverse(Arm1Pos));
        SmartDashboard.putBoolean("Waiting To Finish", true);
    }
}
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RetractArmCollectors extends InstantCommand {
    public RetractArmCollectors(){
        requires(Robot.arm);
    }
    @Override
    protected void execute() {
        Robot.arm.closeArms();
        
    }
}
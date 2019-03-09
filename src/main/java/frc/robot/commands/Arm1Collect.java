package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm1Collect extends InstantCommand {
    int pos = 0;
    public Arm1Collect(int pos ) {
        this.pos=pos;
        requires(Robot.ballCollector);
    }
    @Override
    protected void execute() {
        Robot.ballCollector.setMotorOne(pos);////26100
    }
    @Override
    protected void interrupted() {
        
    }
}
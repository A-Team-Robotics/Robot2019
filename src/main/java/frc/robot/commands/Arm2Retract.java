package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm2Retract extends InstantCommand {
    int pos  = 0;
    public Arm2Retract(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm2);
    }
    @Override
    protected void execute() {
        Robot.ballCollectorArm2.setMotorTwo(pos);
    }
    @Override
    protected void interrupted() {
    }
}
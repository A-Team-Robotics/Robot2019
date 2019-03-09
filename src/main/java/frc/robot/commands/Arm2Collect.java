package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm2Collect extends Command {
    int pos  = 0;
   // boolean continue = false;
    public Arm2Collect(int pos) {
        this.pos = pos;
        requires(Robot.ballCollectorArm2);
    }
    @Override
    protected void initialize() {
        Robot.ballCollectorArm2.setMotorTwo(pos);
    }
    @Override
    protected void interrupted() {
    }
	@Override
	protected boolean isFinished() {
        if(Robot.ballCollectorArm2.getMotorTwoPos()<(pos+2)||Robot.ballCollectorArm2.getMotorTwoPos()<pos||Robot.ballCollectorArm2.getMotorTwoPos()==pos){
            return true;
        }else{
            return false;
        }
	}
}
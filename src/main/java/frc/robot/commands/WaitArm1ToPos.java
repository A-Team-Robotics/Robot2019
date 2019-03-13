package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class WaitArm1ToPos extends Command {

    int pos = 0;
    public WaitArm1ToPos(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm1);
    }

    public WaitArm1ToPos(int pos, double timeout) {
        this.pos=pos;
        setTimeout(timeout);
        requires(Robot.ballCollectorArm1);
    }

    @Override
    protected void initialize() {
        
    }
    @Override
    protected void execute() {
        Robot.ballCollectorArm1.setMotorPos(pos);
    }

    @Override
    protected boolean isFinished() {
       if(Robot.ballCollectorArm1.getMotorPos()>=(pos-10)&&Robot.ballCollectorArm1.getMotorPos()<(pos+20)){
            return true;
       }else{
        return false;
       }
    }

    @Override
	protected void end() {
    	Robot.ballCollectorArm1.stopMotor();
    }

    @Override
    protected void interrupted() {
        end();
    }
}
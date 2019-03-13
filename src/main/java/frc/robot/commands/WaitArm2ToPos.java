package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.BallCollectorArm2;

public class WaitArm2ToPos extends Command {

    int pos = 0;
    public WaitArm2ToPos(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm2);
    }

    public WaitArm2ToPos(int pos,double timeOut) {
        this.pos=pos;
        setTimeout(timeOut);
        requires(Robot.ballCollectorArm2);
    }

    @Override
    protected void initialize() {
       
    }
    @Override
    protected void execute() {
        Robot.ballCollectorArm2.setMotorPos(pos);
    }

    @Override
    protected boolean isFinished() {
       if(Robot.ballCollectorArm2.getMotorPos()>(pos-10)){
            return true;
       }else{
           return false;         
        }   
    }

    @Override
	protected void end() {
    	Robot.ballCollectorArm2.stopMotor();
    }

    @Override
    protected void interrupted() {
        end();
    }
}
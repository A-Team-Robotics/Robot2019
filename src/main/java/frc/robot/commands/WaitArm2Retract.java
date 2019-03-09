package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WaitArm2Retract extends Command {

    int pos = 0;
    public WaitArm2Retract(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm2);
    }
    @Override
    protected void initialize() {
        Robot.ballCollectorArm2.setMotorTwo(pos);
    }
    @Override
    protected void execute() {
        
    }

    @Override
    protected boolean isFinished() {
        if(Robot.ballCollectorArm2.getMotorTwoPos()>400){
            return true;
        }else{
            return false;
        }
    }
}
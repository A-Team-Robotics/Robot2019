package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WaitArm2ToPos extends Command {

    int pos = 0;
    public WaitArm2ToPos(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm2);
    }


    @Override
    protected void initialize() {
        Robot.ballCollectorArm2.setMotorPos(pos);
    }

    @Override
    protected boolean isFinished() {
       if(Robot.ballCollectorArm2.getMotorPos()<(pos+2)){
            return true;
       }else{
           return false;         
        }   
    }
}
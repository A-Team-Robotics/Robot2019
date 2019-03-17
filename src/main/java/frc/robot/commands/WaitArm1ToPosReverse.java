package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class WaitArm1ToPosReverse extends Command {

    int pos = 0;
    public WaitArm1ToPosReverse(int pos) {
        this.pos=pos;
        requires(Robot.ballCollectorArm1);
    }

    @Override
    protected void initialize() {
        Robot.ballCollectorArm1.setMotorPos(pos);
    }

    @Override
    protected void execute() {
        
    }

    @Override
    protected boolean isFinished() {
       if(Robot.ballCollectorArm1.getMotorPos()>(pos)){
           SmartDashboard.putBoolean("Finished Moving 1", true);
            return true;
       }else{
        return false;
       }
    }
}
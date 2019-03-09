package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class StartRollers extends Command{
    public StartRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
        Robot.arm.setRollersForward();
    }
    @Override
    protected void execute() {
        Robot.arm.openArms();
        Robot.arm.setRollersForward();
    }
    @Override
    protected boolean isFinished() {
        if(Robot.arm.getBallStopButton()==true){
            return true;
        }else{
            return false;
        }
    }
    @Override
    protected void end() {
        Robot.arm.stopRollers();
    }
    @Override
    protected void interrupted() {
        Robot.arm.stopRollers();
    }
}
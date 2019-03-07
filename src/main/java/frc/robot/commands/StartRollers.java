package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class StartRollers extends Command{
    public StartRollers(){
        requires(Robot.ballCollector);
    }
    @Override
    protected void initialize() {
        Robot.ballCollector.setRollersForward();
    }
    @Override
    protected void execute() {
        Robot.ballCollector.setRollersForward();
    }
    @Override
    protected boolean isFinished() {
        if(Robot.ballCollectorArm2.getMotorTwoPos()>400){
            return false;
        }else if(Robot.ballCollector.getBallStopButton()==true){
            return true;
        }else{
            return true;
        }
    }
    @Override
    protected void end() {
        Robot.ballCollector.stopRollers();
    }
    @Override
    protected void interrupted() {
        Robot.ballCollector.stopRollers();
    }
}
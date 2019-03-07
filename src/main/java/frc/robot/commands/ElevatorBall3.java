package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ElevatorBall3 extends InstantCommand{

    public ElevatorBall3(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void execute() {
        Robot.elevatorSystem.setElevatorPosition(96000);
    }
}
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TotalConfirmationComponent } from './total-confirmation.component';

describe('TotalConfirmationComponent', () => {
  let component: TotalConfirmationComponent;
  let fixture: ComponentFixture<TotalConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TotalConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TotalConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css']
})
export class StartComponent implements OnInit {

  repo = "";
  username = "";
  password = "";

  constructor() { }

  ngOnInit() {
  }

}

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL

def builder
def parent
def username
def password
def cardsPanel
def country
def male
def female

def onResetClicked = {
  username.text = ''
  password.text = ''
}

def onLoginClicked = {
  println username.text
  println password.text
}

def onRegisterClicked = {
  def cardLayout = cardsPanel.layout
  cardLayout.show(cardsPanel, 'registerScreen')
}

def onBack = {
  def cardLayout = cardsPanel.layout
  cardLayout.show(cardsPanel, 'loginScreen')
}

def onRegisterData = {
  println country.selectedItem
  def gen;
  if (male.selected) {
    gen = 'Male'
  } else {
    gen = 'Female'
  }

  println gen
}

new SwingBuilder().edt {
  parent = frame(title: 'Login Here', size: [500, 500], show: true, defaultCloseOperation: javax.swing.JFrame.EXIT_ON_CLOSE) {
    borderLayout()
    cardsPanel = panel(constraints: BL.CENTER) {
      cardLayout()
      panel(constraints: 'loginScreen') {
        gridLayout(rows: 3, cols: 2)

        label(text: 'Username')
        username = textField()
        label(text: 'Password')
        password = passwordField(id: 'password')
        button(text: 'Login', actionPerformed: onLoginClicked)
        button(text: 'Reset', actionPerformed: onResetClicked)
      }
      panel(constraints: 'registerScreen') {
        gridLayout(rows: 5, cols: 2)

        label(text: 'Username')
        username = textField()
        label(text: 'Password')
        password = passwordField(id: 'password')
        label(text: 'Country')
        country = comboBox(items: ['India', 'USA', 'Canda'])
        label(text: 'Gender')
        panel {
          buttonGroup(id: 'gender')
          male = radioButton(text: 'Male', buttonGroup: gender)
          female = radioButton(text: 'Female', buttonGroup: gender)
        }
        button(text: 'Register', actionPerformed: onRegisterData)
        button(text: 'Back', actionPerformed: onBack)
      }
    }
    panel(constraints: BL.SOUTH) {
      // default layout is FlowLayout
      button(text: 'Register', actionPerformed: onRegisterClicked)
    }
  }
}
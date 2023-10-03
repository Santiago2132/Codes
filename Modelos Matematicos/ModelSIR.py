import numpy as np
from scipy.integrat import odeint
import matplotlib.pyplot as plt

# Parámetros del modelo
beta = 0.2  # tasa de infección
gamma = 0.1  # tasa de recuperación

# Condiciones iniciales
S0 = 1000  # Población susceptible inicial
I0 = 1     # Población infectada inicial
R0 = 0     # Población recuperada inicial

# Tiempo total de simulación y pasos de tiempo
t = np.linspace(0, 160, 160)  # 160 días

# Las ecuaciones diferenciales del modelo SIR
def deriv(y, t, beta, gamma):
    S, I, R = y
    dSdt = -beta * S * I
    dIdt = beta * S * I - gamma * I
    dRdt = gamma * I
    return dSdt, dIdt, dRdt

# Vector de condiciones iniciales
y0 = S0, I0, R0

# Integra las ecuaciones SIR en la cuadrícula de tiempo t
ret = odeint(deriv, y0, t, args=(beta, gamma))
S, I, R = ret.T

# Gráfica los datos en tres curvas separadas para S(t), I(t) y R(t)
fig = plt.figure(facecolor='w')
ax = fig.add_subplot(111, axisbelow=True)
ax.plot(t, S/1000, 'b', alpha=0.5, lw=2, label='Susceptible')
ax.plot(t, I/1000, 'r', alpha=0.5, lw=2, label='Infected')
ax.plot(t, R/1000, 'g', alpha=0.5, lw=2, label='Recovered with immunity')
ax.set_xlabel('Time /days')
ax.set_ylabel('Number (1000s)')
ax.set_ylim(0,1.2)
ax.yaxis.set_tick_params(length=0)
ax.xaxis.set_tick_params(length=0)
ax.grid(b=True, which='major', c='w', lw=2, ls='-')
legend = ax.legend()
legend.get_frame().set_alpha(0.5)
for spine in ('top', 'right', 'bottom', 'left'):
    ax.spines[spine].set_visible(False)
plt.show()